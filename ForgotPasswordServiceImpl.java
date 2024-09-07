package com.parthiv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parthiv.domain.VerificationType;
import com.parthiv.model.ForgotPasswordToken;
import com.parthiv.model.User;
import com.parthiv.repository.ForgotPasswordRepository;

import java.util.Optional;

@Service
public class ForgotPasswordServiceImpl implements ForgotPasswordService{
    @Autowired
    private ForgotPasswordRepository forgotPasswordRepository;

    @Override
    public ForgotPasswordToken createToken(User user,
                                           String id,
                                           String otp,
                                           VerificationType verificationType,
                                           String sendTo
    ) {
        ForgotPasswordToken forgotPasswordToken=new ForgotPasswordToken();
        forgotPasswordToken.setUser(user);
        forgotPasswordToken.setId(id);
        forgotPasswordToken.setOtp(otp);
        forgotPasswordToken.setVerificationType(verificationType);
        forgotPasswordToken.setSendTo(sendTo);

        return forgotPasswordRepository.save(forgotPasswordToken);
    }

    @Override
    public ForgotPasswordToken findById(String id) {
        Optional<ForgotPasswordToken> opt=forgotPasswordRepository.findById(id);
        return opt.orElse(null);
    }

    @Override
    public ForgotPasswordToken findByUser(Long userId) {
        return forgotPasswordRepository.findByUserId(userId);
    }

    @Override
    public void deleteToken(ForgotPasswordToken token) {

        forgotPasswordRepository.delete(token);

    }

    @Override
    public boolean verifyToken(ForgotPasswordToken token, String otp) {
        return token.getOtp().equals(otp);
    }
}
