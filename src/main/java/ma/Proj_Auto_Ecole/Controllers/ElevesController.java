package ma.Proj_Auto_Ecole.Controllers;

import ma.Proj_Auto_Ecole.dto.ElevesDto;
import ma.Proj_Auto_Ecole.service.EleveServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ap")
public class ElevesController {
    private static final Logger LOGGER = LoggerFactory.getLogger(ElevesController.class);

    private EleveServiceImp EleveService;
    public  ElevesController(EleveServiceImp EleveService )
    {
        this.EleveService=EleveService;
    }
    @PostMapping("/create")
    public ElevesDto create (@RequestBody ElevesDto  dto)
    {
        LOGGER.debug("start save dto : {}", dto);
        ElevesDto  result = EleveService.create(dto);
        LOGGER.debug("end save");
        return result;
    }
    @PutMapping("/update")
    public ElevesDto  update(@RequestBody ElevesDto  dto)
    {
        LOGGER.debug("start update dto : {}",dto);
        ElevesDto  result=EleveService.update(dto);
        LOGGER.debug("end update");
        return  result;
    }

    @DeleteMapping("/{cin}")
    public boolean delete (@PathVariable("cin") String cin)
    {
        LOGGER.debug("start delete dto : {}",cin);
        boolean result = EleveService.delete(cin);
        LOGGER.debug("end delete");
        return  result;
    }

    @GetMapping("/select")
    public List<ElevesDto > selectAll()
    {
        LOGGER.debug("start  selectAll");
        List<ElevesDto >lls=EleveService.select();
        LOGGER.debug("end methode selectAll");
        return lls;
    }




}
