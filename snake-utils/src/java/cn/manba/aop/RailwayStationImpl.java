package cn.manba.aop;

/**
 * RailwayStation
 *
 * @author Geweilang
 * @date 2021-06-21
 */
public class RailwayStationImpl implements TicketService{
    @Override
    public void sellTicket(){
        System.out.println("售票............");
    }
    @Override
    public void inquire() {
        System.out.println("问询.............");
    }

    @Override
    public void withdraw() {
        System.out.println("退票.............");
    }
}
