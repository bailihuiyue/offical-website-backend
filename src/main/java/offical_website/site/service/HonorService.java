package offical_website.site.service;

import offical_website.site.model.Honor;

import java.util.List;

public interface HonorService {
    int createHonor(String remark, String img);

    int deleteHonor(long id);

    int updateHonor(String remark, long id, String img);

    List<Honor> getHonorAll();

    Honor getHonorById(long id);
}