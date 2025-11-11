package site.cogirihub.api.search;

import java.util.Locale;

import org.springframework.stereotype.Component;

@Component
public class SearchFacadeImpl implements SearchFacade {

    @Override
    public void handleSearch(String category, String keyword) {
        String normalizedCategory = category == null ? "" : category.toLowerCase(Locale.ROOT);
        System.out.printf("[SearchFacade] category=%s, keyword=%s%n", normalizedCategory, keyword);
        // TODO: 각 도메인(player, schedule, stadium, team) 서비스 연결 로직 추가
    }
}
