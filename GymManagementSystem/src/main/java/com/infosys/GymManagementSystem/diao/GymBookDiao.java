package com.infosys.GymManagementSystem.diao;

import java.util.List;

import com.infosys.GymManagementSystem.bean.GymBook;

public interface GymBookDiao {
	public void save(GymBook gymBook);
	public Long generateBookingId();
	public List<GymBook> getBookList();
	public GymBook findBookInfoById(Long id);
	public void deleteById(Long id);
	public List<GymBook> findBookingsByUsername(String username);
	public void deleteBookingsBySlotId(Long slotId);
	public void deleteBookingsByItemId(Long itemId);

	
}