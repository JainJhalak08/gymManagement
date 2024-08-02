package com.infosys.GymManagementSystem.diao;

import java.util.List;

import com.infosys.GymManagementSystem.bean.Feedback;

public interface FeedbackDiao {
	void save(Feedback feedback);
    Long generateFeedbackId();
    List<Feedback> findAll();
    Feedback findById(Long id);
}