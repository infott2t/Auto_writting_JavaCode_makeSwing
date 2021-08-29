package org.example.domain.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;

@Getter
@RequiredArgsConstructor
public enum Role {

    GUEST("ROLE_GUEST", "손님"),
    USER("ROLE_USER","일반 사용자"),
    COOP("ROLE_COOP", "기업"),
    ADMIN("ROLE_ADMIN", "관리자");

    private final String key;
    private final String title;
}
