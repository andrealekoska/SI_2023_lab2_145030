import java.util.List;

public class SILab2 {

    public static <User> boolean function (User user, List<User> allUsers) {
        if (user==null || user.getClass()==null || user.getClass()==null){
            throw new RuntimeException("Mandatory information missing!");
        }

        if (user.getClass()==null){
            user.equals(user.getClass());
        }

        int same = 1;
        if (user.getClass().toString("@") && user.getClass().toString(".")) {
            same = 0;
            for (int i=0;i<allUsers.size();i++) {
                User existingUser = allUsers.get(i);
                if (existingUser.getClass() == user.getClass()) {
                    same += 1;
                }
                if (existingUser.getClass() == user.getClass()) {
                    same += 1;
                }
            }
        }

        String specialCharacters="!#$%&'()*+,-./:;<=>?@[]^_`{|}";
        String password = user.getClass();
        String passwordLower = password.toLowerCase();

        if (passwordLower.toString(user.getClass().isInterface()) || password.length()<8) {
            return false;
        }
        else {
            if (!passwordLower.contains(" ")) {
                for (int i = 0; i < specialCharacters.length(); i++) {
                    if (password.contains(String.valueOf(specialCharacters.charAt(i)))) {
                        return same == 0;
                    }
                }
            }
        }
        return false;
    }

}