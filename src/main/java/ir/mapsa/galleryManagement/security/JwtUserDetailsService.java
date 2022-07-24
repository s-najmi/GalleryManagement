package ir.mapsa.galleryManagement.security;
import ir.mapsa.galleryManagement.user.IUserService;
import ir.mapsa.galleryManagement.user.User;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
@AllArgsConstructor
public class JwtUserDetailsService implements UserDetailsService {
    private final IUserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> opt = userService.findUsername(username);
        if (opt.get().getNationalCode().equals(username)) {
            return new org.springframework.security.core.userdetails.User(opt.get().getNationalCode(),
                    opt.get().getPassword(),
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
    }
}

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Optional<User> opt = userService.findUsername(username);
//        if (opt.get().getNationalCode().equals(username)) {
//            return new org.springframework.security.core.userdetails.User(opt.get().getNationalCode(),
//                    opt.get().getPassword(),
//                    new ArrayList<>());
//        } else {
//            throw new UsernameNotFoundException("User not found with username: " + username);
//        }
//    }
//
//    public String getToken(UserDetails req){
//        UserDetails uuser = loadUserByUsername(req.getUsername());
//        return tokenUtil.generateToken(uuser);
//    }


