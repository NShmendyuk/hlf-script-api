package ru.inside.commands.hyperledger.fabric.ca;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import ru.inside.commands.hyperledger.fabric.ca.admin.CAAuthAdmin;
import ru.inside.commands.hyperledger.fabric.ca.user.CAAuthUser;

@Slf4j
@Component
@NoArgsConstructor
public class RegistCAClient {

    public static void initializeUsersCA() {
        // enrolls the admin and registers the user
        try {
            CAAuthAdmin.main(null);
            log.info("admin enrolled");
            CAAuthUser.main(null);
            log.info("user enrolled");
        } catch (Exception e) {
            log.error("Cannot enroll users");
        }
    }
}
