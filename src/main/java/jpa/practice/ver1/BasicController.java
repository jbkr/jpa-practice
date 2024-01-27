package jpa.practice.ver1;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BasicController {

	private final ItemService itemService;

	public BasicController(ItemService itemService) {
		this.itemService = itemService;
	}

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/add")
	public String addForm() {
		return "add";
	}

	@GetMapping("/list")
	public String list(Model model) {
		List<Item> list = itemService.list();
		model.addAttribute("list", list);
		return "list";
	}

	@PostMapping("/add")
	public String add(@ModelAttribute ItemDTO itemDTO) {
		Item item = new Item();
		item.setName(itemDTO.getName());
		item.setPrice(itemDTO.getPrice());
		itemService.addItem(item);
		return "redirect:/";
	}

}
