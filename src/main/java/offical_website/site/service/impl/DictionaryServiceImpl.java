package offical_website.site.service.impl;

import offical_website.site.dao.DictionaryMapper;
import offical_website.site.model.Dictionary;
import offical_website.site.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictionaryServiceImpl implements DictionaryService {

    @Autowired
    DictionaryMapper dictionaryMapper;

    @Override
    public int createDictionary(String dictKey, String content) {
        int dictionary = dictionaryMapper.createDictionary(dictKey, content);
        return dictionary;
    }

    @Override
    public int deleteDictionary(long id) {
        int dictionary = dictionaryMapper.deleteDictionary(id);
        return dictionary;
    }

    @Override
    public int updateDictionary(String dictKey, long id, String content) {
        int dictionary = dictionaryMapper.updateDictionary(dictKey, id, content);
        return dictionary;
    }

    @Override
    public List<Dictionary> getDictionaryAll() {
        List<Dictionary> dictionary = dictionaryMapper.getDictionaryAll();
        return dictionary;
    }

    @Override
    public Dictionary getDictionaryById(long id) {
        Dictionary dictionary = dictionaryMapper.getDictionaryById(id);
        return dictionary;
    }
}