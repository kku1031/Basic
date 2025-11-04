package site.cogirihub.api.common;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import site.cogirihub.api.domain.Messenger;

@RestController
@Tag(name = "홈", description = "홈 페이지 관련 API - API 서버 상태 확인 및 기본 정보 제공")
public class HomeController {

    @GetMapping("/")
    @Operation(summary = "홈 페이지 조회", description = "API 서버의 기본 홈 페이지를 반환합니다. 서버가 정상적으로 실행 중인지 확인할 수 있습니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "성공적으로 응답을 반환했습니다.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Messenger.class), examples = @ExampleObject(name = "성공 응답 예시", value = "{\"code\": 200, \"message\": \"Hello World\"}")))
    })
    public Messenger home() {
        return Messenger.builder()
                .code(200)
                .message("Hello World")
                .build();
    }

    @GetMapping("/docs")
    @Operation(summary = "Swagger UI", description = "API 문서를 확인할 수 있는 Swagger UI 페이지로 이동합니다.")
    public RedirectView docs() {
        RedirectView redirectView = new RedirectView("/swagger-ui/index.html");
        redirectView.setContextRelative(false);
        return redirectView;
    }
}
