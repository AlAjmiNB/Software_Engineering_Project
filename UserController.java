@RestController
@RequestMapping("/api/users")
public class UserController {
    
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody UserLoginRequest loginRequest) {
        // Validate login credentials and generate JWT token
        return ResponseEntity.ok(new UserTokenResponse("JWT_TOKEN_HERE"));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> signupUser(@RequestBody UserSignupRequest signupRequest) {
        // Create a new user account
        userService.createUser(signupRequest);
        return ResponseEntity.ok(new ApiResponse("User registered successfully"));
    }

    // Other endpoints for profile management, forum actions, etc.
}
