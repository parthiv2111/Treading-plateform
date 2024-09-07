package com.parthiv.service;

import com.parthiv.model.CoinDTO;
import com.parthiv.response.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}
