package com.infosys.GymManagementSystem.diao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.infosys.GymManagementSystem.bean.SlotItem;

@Service
@Repository
public class SlotItemDiaoImpl implements SlotItemDiao{

	@Autowired
	private SlotItemRepository repository;
	
	@Override
	public void save(SlotItem slotItem) {
		// TODO Auto-generated method stub
		repository.save(slotItem);
	}

}