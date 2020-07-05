package com.kronographtl.springsequritymysql.service;

import com.kronographtl.springsequritymysql.model.UserDO;
import com.kronographtl.springsequritymysql.model.UserDetailDO;
import com.kronographtl.springsequritymysql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class KronographUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<UserDO> userDO = userRepository.findUserByUserName(userName);
        userDO.orElseThrow(() ->new UsernameNotFoundException("Not Found" + userName));
        return userDO.map(UserDetailDO::new).get();
    }
}
