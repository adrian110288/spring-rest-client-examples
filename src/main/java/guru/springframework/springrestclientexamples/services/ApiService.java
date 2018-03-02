package guru.springframework.springrestclientexamples.services;

import guru.springframework.springrestclientexamples.api.domain.User;

import java.util.List;

public interface ApiService {

    List<User> getUsers(Integer limit);
}
