package offical_website.site.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import offical_website.site.model.Cases;
import offical_website.site.service.impl.CaseServiceImpl;
import offical_website.site.tools.ApiException;
import offical_website.site.tools.Result;
import offical_website.site.tools.TokenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.File;
import java.nio.file.Files;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Api(tags = "案例管理")
@RestController
@RequestMapping(value = "/api/Upload")
public class UploadController {

    @Autowired
    CaseServiceImpl caseService;

    @PostMapping("/UploadImage")
    @ApiOperation(value = "上传图片", notes = "上传图片")
    public Result<String> uploadImage(@RequestHeader("token") String token, @RequestParam("file") MultipartFile file) throws Exception {
        ApiException.invalidToken(token);

        if (file.isEmpty()) {
            return Result.failed("文件为空");
        }
        String fileName = file.getOriginalFilename();  // 文件名
        String extension = fileName.substring(fileName.lastIndexOf("."));  // 后缀名
        String filePath = ResourceUtils.getURL("imageStore").getPath()+"/"; // 上传后的路径
        fileName = UUID.randomUUID() + extension; // 新文件名
        File dest = new File(filePath + fileName);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);
            return Result.success("/imageStore/" + fileName);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.failed("上传失败,请重试");
        }
    }
}