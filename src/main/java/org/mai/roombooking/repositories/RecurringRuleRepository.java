package org.mai.roombooking.repositories;


import org.mai.roombooking.entities.RecurringRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RecurringRuleRepository extends JpaRepository<RecurringRule, Long>
{

}
