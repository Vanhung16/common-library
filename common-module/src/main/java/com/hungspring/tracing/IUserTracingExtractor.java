package com.hungspring.tracing;

import org.springframework.security.core.Authentication;

public interface IUserTracingExtractor {
    default Object getUserId(Authentication authentication) {
        return authentication.getPrincipal();
    }
}
