package offical_website.site.service.impl;

import offical_website.site.dao.CaseMapper;
import offical_website.site.model.Cases;
import offical_website.site.service.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaseServiceImpl implements CaseService {

    @Autowired
    CaseMapper caseDataMapper;

    @Override
    public int createCase(String img, String title, String content) {
        int caseData = caseDataMapper.createCase(img, title, content);
        return caseData;
    }

    @Override
    public int deleteCase(long id) {
        int caseData = caseDataMapper.deleteCase(id);
        return caseData;
    }

    @Override
    public int updateCase(long id, String img, String title, String content) {
        int caseData = caseDataMapper.updateCase(id, img, title, content);
        return caseData;
    }

    @Override
    public List<Cases> getCaseAll() {
        List<Cases> casesData = caseDataMapper.getCaseAll();
        return casesData;
    }

    @Override
    public Cases getCaseById(long id) {
        Cases casesData = caseDataMapper.getCaseById(id);
        return casesData;
    }
}