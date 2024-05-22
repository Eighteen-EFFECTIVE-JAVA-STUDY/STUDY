package 아이템7;

import java.util.WeakHashMap;

/**
 * packageName    : 아이템7
 * fileName       : CacheExample
 * author         : sjunpark
 * date           : 24. 5. 22.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 5. 22.        sjunpark       최초 생성
 */
public class CacheExample {
    private WeakHashMap<String, Object> cache = new WeakHashMap<>();

    public void addToCache(String key, Object value) {
        cache.put(key, value);
    }

    public Object getFromCache(String key) {
        return cache.get(key);
    }
}