package sswa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import sswa.entity.User;
import sswa.model.CustomUserDetails;
import sswa.repositories.UserRepository;

import java.util.function.Supplier;

@Service
public class JpaUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository repository;

    @Override
    public CustomUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Supplier<UsernameNotFoundException> supplier =
                () -> new UsernameNotFoundException("Something wrong with authentication!!!");

        User user = repository.findUserByUsername(username).orElseThrow(supplier);

        return new CustomUserDetails(user);
    }
}
