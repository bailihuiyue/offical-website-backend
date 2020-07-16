package offical_website.site.service.impl;

import offical_website.site.dao.EnterpriseMapper;
import offical_website.site.model.Enterprise;
import offical_website.site.service.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnterpriseServiceImpl implements EnterpriseService {

    @Autowired
    EnterpriseMapper enterpriseMapper;

    @Override
    public int createEnterprise(String remark, String img) {
        int enterprise = enterpriseMapper.createEnterprise(remark, img);
        return enterprise;
    }

    @Override
    public int deleteEnterprise(long id) {
        int enterprise = enterpriseMapper.deleteEnterprise(id);
        return enterprise;
    }

    @Override
    public int updateEnterprise(String remark, long id, String img) {
        int enterprise = enterpriseMapper.updateEnterprise(remark, id, img);
        return enterprise;
    }

    @Override
    public List<Enterprise> getEnterpriseAll() {
        List<Enterprise> enterprise = enterpriseMapper.getEnterpriseAll();
        return enterprise;
    }

    @Override
    public Enterprise getEnterpriseById(long id) {
        Enterprise enterprise = enterpriseMapper.getEnterpriseById(id);
        return enterprise;
    }
}