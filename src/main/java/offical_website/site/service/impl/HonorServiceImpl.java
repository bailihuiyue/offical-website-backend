package offical_website.site.service.impl;

import offical_website.site.dao.HonorMapper;
import offical_website.site.model.Honor;
import offical_website.site.service.HonorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HonorServiceImpl implements HonorService {

    @Autowired
    HonorMapper honorMapper;

    @Override
    public int createHonor(String remark, String img) {
        int honor = honorMapper.createHonor(remark, img);
        return honor;
    }

    @Override
    public int deleteHonor(long id) {
        int honor = honorMapper.deleteHonor(id);
        return honor;
    }

    @Override
    public int updateHonor(String remark, long id, String img) {
        int honor = honorMapper.updateHonor(remark, id, img);
        return honor;
    }

    @Override
    public List<Honor> getHonorAll() {
        List<Honor> honor = honorMapper.getHonorAll();
        return honor;
    }

    @Override
    public Honor getHonorById(long id) {
        Honor honor = honorMapper.getHonorById(id);
        return honor;
    }
}