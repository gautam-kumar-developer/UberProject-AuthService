package com.example.UberProject_AuthService.services;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


@Service
public class JwtService implements CommandLineRunner {
    @Value("${jwt.secret}")
    private String SECRET;
//    @Value("${jwt.expiry}")
//    private Long expiry;

    private SecretKey getSignKey() {
        byte[] keyBytes = SECRET.getBytes(StandardCharsets.UTF_8);
        return Keys.hmacShaKeyFor(keyBytes);
    }

    private String createToken(Map<String, Object> payloads, String username) {
        return Jwts.builder()
                .claims(payloads)
                .subject(username)
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis() + 1000 * 60 * 30))
                .signWith(getSignKey())
                .compact();
    }

    @Override
    public void run(String... args) throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("email", "abc@gmail.com");
        map.put("phoneNumber", "792759275");
        String result = createToken(map, "gautam");
        System.out.println("Generated token is : " + result);
    }
}
