package hellojpa;

import jakarta.persistence.*;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager(); // 엔티티 매니저 소환
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        // 실제로 동작하는 코드 작성
        Member member = new Member();
        member.setId(1L);
        member.setName("HelloA");
        em.persist(member);
        tx.commit();
        em.close();
        emf.close();

        em.close();
        emf.close();
    }
}
