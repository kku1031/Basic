package site.cogirihub.api.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Messenger {
    private int code;
    private String message;
}
