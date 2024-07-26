package com.rafed.security.token;

import com.rafed.security.user.User;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "_token")
@Builder
public class Token {
    @Id
    @GeneratedValue
    private Long id;
    private String token;
    @Enumerated(EnumType.STRING)
    private TokenType tokenType;
    private Boolean expired;
    private Boolean revoked;

    public Token(Boolean expired, Boolean revoked) {
        this.expired = expired;
        this.revoked = revoked;
    }

    public boolean isExpired() {
        return expired;
    }

    public boolean isRevoked() {
        return revoked;
    }
    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;
}
