package mar.lagoon.service;

import mar.lagoon.model.User;

import java.util.List;

/**
 * Created by Le on 4/27/2016.
 */
public interface UserService {

    List<User> findAllUsers();

    User findByUserName(String userName);

    User save(User user);


}
