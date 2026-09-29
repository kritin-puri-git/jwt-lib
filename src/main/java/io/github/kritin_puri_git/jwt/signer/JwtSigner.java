package io.github.kritin_puri_git.jwt.signer;


import io.github.kritin_puri_git.jwt.model.TokenClaims;

import java.util.Optional;

public interface JwtSigner {
    short getVersion();
    String generateToken(TokenClaims tokenClaims);
    Optional<TokenClaims> verify(String Jwt);

}
