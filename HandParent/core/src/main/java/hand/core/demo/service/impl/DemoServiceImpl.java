package hand.core.demo.service.impl;

import hand.core.demo.dto.Demo;
import hand.core.demo.service.IDemoService;

import com.hand.hap.core.IRequest;
import com.hand.hap.system.dto.DTOStatus;
import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DemoServiceImpl extends BaseServiceImpl<Demo> implements IDemoService {

}
