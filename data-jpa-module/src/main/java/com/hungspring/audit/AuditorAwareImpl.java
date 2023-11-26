package com.hungspring.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Optional;


public class AuditorAwareImpl implements AuditorAware<Object> {
    private static final String ANONYMOUS = "anonymousUser";
    private static final String NO_AUTHENTICATION = "noAuthentication";

    @Override
    public Optional<Object> getCurrentAuditor() {
        var authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || !authentication.isAuthenticated()) {
            return Optional.of(NO_AUTHENTICATION);
        } else {
            if (authentication.getPrincipal().equals(ANONYMOUS)) {
                return Optional.of(ANONYMOUS);
            } else {
                return null;
//                return Optional.of(authentication).map(item -> iUserTracingExtractor.getUserId(authentication));
            }
        }
    }
}
