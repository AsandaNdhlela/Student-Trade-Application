package za.ac.student_trade.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.student_trade.domain.Residence;
import za.ac.student_trade.domain.Student;
import za.ac.student_trade.repository.ResidenceRepository;
import za.ac.student_trade.service.IService;

import java.util.List;
@Service
public class ResidenceServiceImpl implements IService <Residence, Long>{


    private ResidenceRepository residenceRepository;

    @Autowired
    public ResidenceServiceImpl(ResidenceRepository residenceRepository) {
        this.residenceRepository = residenceRepository;
    }

    @Override
    public Residence create(Residence residence) {
        return residenceRepository.save(residence);
    }

    @Override
    public Residence read(Long aLong) {
        return  this.residenceRepository.findById(aLong).orElse(null);
    }

    @Override
    public Residence update(Residence residence) {
        return  residenceRepository.save(residence);
    }

}
