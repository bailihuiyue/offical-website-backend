package offical_website.site.service;

import offical_website.site.model.Dictionary;

import java.util.List;

public interface DictionaryService {
    int createDictionary(String dictKey, String content);

    int deleteDictionary(long id);

    int updateDictionary(String dictKey, long id, String content);

    List<Dictionary> getDictionaryAll();

    Dictionary getDictionaryById(long id);
}