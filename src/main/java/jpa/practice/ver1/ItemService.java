package jpa.practice.ver1;

import org.springframework.stereotype.Service;

@Service
public class ItemService {

	private final JPAItemRepository jpaItemRepository;

	public ItemService(JPAItemRepository jpaItemRepository) {
		this.jpaItemRepository = jpaItemRepository;
	}

	public Item addItem(Item item) {
		return jpaItemRepository.add(item);
	}
}
