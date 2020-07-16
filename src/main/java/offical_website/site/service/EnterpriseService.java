package offical_website.site.service;

import offical_website.site.model.Enterprise;

import java.util.List;

public interface EnterpriseService {
    int createEnterprise(String remark, String img);

    int deleteEnterprise(long id);

    int updateEnterprise(String remark, long id, String img);

    List<Enterprise> getEnterpriseAll();

    Enterprise getEnterpriseById(long id);
}