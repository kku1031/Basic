package site.cogirihub.api.search;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.cogirihub.api.domain.Messenger;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/soccer")
@RequiredArgsConstructor
public class SearchController {

    private final SearchFacade searchFacade;

    @GetMapping("/search/find-by-keyword")
    public ResponseEntity<Messenger> findByKeyword(
            @RequestParam("category") String category,
            @RequestParam("keyword") String keyword) {

        searchFacade.handleSearch(category, keyword);
        return ResponseEntity.ok(Messenger.builder()
                .code(200)
                .message("Search request logged")
                .build());
    }
}
