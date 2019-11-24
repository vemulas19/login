package com.login;

import java.util.List;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;


public class OrderManagementService {

	IOrderManagementDao dao = new OrderDaoImpl();

	final static Logger logger = Logger.getLogger(OrderManagementService.class);
	
	public String deleteItem(int itemId) {
		logger.info("executing OrderManagementService :: deleteItem!!");
		int result = dao.deleteItem(itemId);

		if (result == 1) {
			logger.debug("Deleted Succssful!!" + itemId);
			String message = itemId + " deleted successfully!!";
		} else {
			logger.debug("Failed to delete!!" + itemId);
			String message = itemId + " failed to delete!!";
		}

		// fetching updated menu data to show in view page
		List<String> menuData = dao.fetchMenu();
		logger.info("exit OrderManagementService :: deleteItem!!");
		return "menu";
	}
	
	public String updateItem(User user) {
		logger.info("executing OrderManagementService :: updateItem");
		String mailId = user.getMailId();
		boolean isValidMailId = isValidMail(mailId);
		if(isValidMailId)
			System.out.println("Entered mail is valid!!");
		else
			System.out.println("Entered mail is invalid!!");
		
//		fetching updated menu data to show in view page

		List<String> fetchMenu = dao.fetchMenu();

		logger.info("exit OrderManagementService :: updateItem");
		return "menu";
	}
	
	public static boolean isValidMail(String email) 
    { 
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+ 
                            "[a-zA-Z0-9_+&*-]+)*@" + 
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    } 
	
	public String editView(int itId) {
		logger.info("executing OrdermangementService :: editView");
		String item = dao.getItemInfoByItemId(itId);

		
		logger.info("exit OrdermangementService :: editView");
		return "editView";
	}
}
