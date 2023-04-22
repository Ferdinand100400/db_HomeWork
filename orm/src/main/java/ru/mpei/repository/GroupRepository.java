
package ru.mpei.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.mpei.models.Groups;

import java.util.Optional;

public interface GroupRepository extends JpaRepository<Groups, Long> {

    @Query("select c from Groups c where c.groups = :groups")
    Optional<Groups> findByGroups(@Param("groups") String groups);

    @Query("select c from Groups c where c.id = :id")
    Optional<Groups> findById(@Param("id") long id);

    @Modifying
    @Transactional
    @Query("update Groups c set c.groups = :groups where c.id = :id")
    void updateGroupsById(@Param("id") long id, @Param("groups") String groups);

}






/*package ru.mpei.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import ru.mpei.models.Group;

import java.util.Optional;

public interface GroupRepository extends JpaRepository<Group, Long> {

    @Query("select g from Group g where g.group = :group")
    Optional<Group> findByGroup(@Param("group") String group);

    @Modifying
    @Transactional
    @Query("update Group g set g.group = :group where g.id = :id")
    void updateGroupById(@Param("id") long id, @Param("group") String group);

}

 */
