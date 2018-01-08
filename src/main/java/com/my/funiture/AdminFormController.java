package com.my.funiture;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class AdminFormController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminFormController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	
	@RequestMapping(value = "/at_index", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
		logger.info("Welcome index! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "admin_form/index";
	}
	
	@RequestMapping(value = "/at_flot", method = RequestMethod.GET)
	public String flot(Locale locale, Model model) {
		logger.info("Welcome flot! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "admin_form/flot";
	}

	@RequestMapping(value = "/at_tables", method = RequestMethod.GET)
	public String tables(Locale locale, Model model) {
		logger.info("Welcome tables! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "admin_form/tables";
	}
	
	@RequestMapping(value = "/at_forms", method = RequestMethod.GET)
	public String forms(Locale locale, Model model) {
		logger.info("Welcome forms! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "admin_form/forms";
	}
	
	@RequestMapping(value = "/at_panels", method = RequestMethod.GET)
	public String panels(Locale locale, Model model) {
		logger.info("Welcome panels! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "admin_form/panels-wells";
	}
	
	@RequestMapping(value = "/at_buttons", method = RequestMethod.GET)
	public String buttons(Locale locale, Model model) {
		logger.info("Welcome buttons! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "admin_form/buttons";
	}
	
	@RequestMapping(value = "/at_notifications", method = RequestMethod.GET)
	public String notifications(Locale locale, Model model) {
		logger.info("Welcome notifications! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "admin_form/notifications";
	}
	
	@RequestMapping(value = "/at_typography", method = RequestMethod.GET)
	public String typography(Locale locale, Model model) {
		logger.info("Welcome typography! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "admin_form/typography";
	}
	
	@RequestMapping(value = "/at_icons", method = RequestMethod.GET)
	public String icons(Locale locale, Model model) {
		logger.info("Welcome icons! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "admin_form/icons";
	}
	
	@RequestMapping(value = "/at_grid", method = RequestMethod.GET)
	public String grid(Locale locale, Model model) {
		logger.info("Welcome grid! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "admin_form/grid";
	}
	
	@RequestMapping(value = "/at_blank", method = RequestMethod.GET)
	public String blank(Locale locale, Model model) {
		logger.info("Welcome blank! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "admin_form/blank";
	}
	
	@RequestMapping(value = "/at_login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		logger.info("Welcome login! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "admin_form/login";
	}
}
