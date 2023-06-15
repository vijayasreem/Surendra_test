@Repository
public interface LoginRepository extends JpaRepository<User, Long> {

    User findByUsernameAndPassword(String username, String password);
    
    User findByUsername(String username);
    
    void resetPassword(String username, String newPassword);
    
    void logout(String username);
    
}