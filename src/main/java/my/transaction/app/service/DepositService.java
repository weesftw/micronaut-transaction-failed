package my.transaction.app.service;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import my.transaction.app.model.Deposit;
import my.transaction.app.repository.DepositHistoryRepository;
import my.transaction.app.repository.DepositRepository;
import org.springframework.transaction.annotation.Transactional;

@Named
public class DepositService {

    private final DepositHistoryRepository depositHistoryRepository;
    private final DepositRepository depositRepository;

    @Inject
    public DepositService(DepositHistoryRepository depositHistoryRepository, DepositRepository depositRepository) {
        this.depositHistoryRepository = depositHistoryRepository;
        this.depositRepository = depositRepository;
    }

    @Transactional(rollbackFor = Throwable.class)
    public void makeDeposit(Deposit deposit) {
        depositRepository.makeDeposit(deposit);
        if (1 == 1) {
            throw new RuntimeException();
        }
        depositHistoryRepository.makeDepositHistory(deposit);
    }

}
