package io.github.kritin_puri_git.jwt.service;

import io.github.kritin_puri_git.jwt.model.TokenClaims;

import java.util.Optional;

public interface JwtService {
    String generateToken(TokenClaims tokenClaims);
    Optional<TokenClaims> verify(String Jwt);
}
