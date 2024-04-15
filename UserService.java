@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public void createUser(UserSignupRequest signupRequest) {
        // Logic to create a new user in the database
    }

    // Other service methods for user-related operations
}
