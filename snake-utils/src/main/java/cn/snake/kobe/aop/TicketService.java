package cn.snake.kobe.aop;

/**
 * TicketService
 *
 * @author Geweilang
 * @date 2021-06-21
 */
public interface TicketService {
    /**
     * 售票
     */
    void sellTicket();

    /**
     * 问询
     */
    void inquire();

    /**
     * 退票
     */
    void withdraw();
}
