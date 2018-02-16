package spring.test;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	public String getUserNameById( long id ) {
		return "ironcero";
	}
}
