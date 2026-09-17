package com.example.teamapp.service;

import org.springframework.stereotype.Service;

@Service
public class HojoService {
    public String getProfile() {
        return "メンバーの北條です！趣味は読書です！";
    }
}