package carvedrockfitness.user;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserController {
	private static final UserService userService = new UserService();
	private static final Logger LOGGER = Logger.getLogger(UserController.class.getName());

//	static { // 3
//		LOGGER.setLevel(Level.FINE); 
////		ConsoleHandler consoleHandler = new ConsoleHandler();
////		consoleHandler.setLevel(Level.FINE); // overrides the logger level
////		LOGGER.addHandler(consoleHandler);
//		try { // 4
//			FileHandler fileHandler = new FileHandler(UserController.class.getName()+".log");
//			fileHandler.setLevel(Level.FINE);
//			fileHandler.setFormatter(new SimpleFormatter());
//			LOGGER.addHandler(fileHandler);
//		} catch (SecurityException | IOException e) {
//			e.printStackTrace();
//		}
//	}
	
	// get all endpoint
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	// get by carvedrockfitness.user.UserStatus
	public List<User> getAllUsersByUserStatus(UserStatus userStatus) {
		return userService.getAllUsersByUserStatus(userStatus);
	}

	// post endpoint
	public boolean addUser(User user) {
//        LOGGER.log(Level.INFO, "In endpoint for adding user, with these user details: " + user); // 2
		LOGGER.log(Level.FINE, "In endpoint for adding user, with these user details: " + user); // 3
		return userService.addUser(user);
	}

	// delete
	public boolean deleteUser(User user) {
		return userService.deleteUser(user);
	}
}
