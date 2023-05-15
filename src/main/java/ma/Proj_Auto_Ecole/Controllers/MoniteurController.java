package ma.Proj_Auto_Ecole.Controllers;

import ma.Proj_Auto_Ecole.dto.ElevesDto;
import ma.Proj_Auto_Ecole.dto.MoniteursDto;
import ma.Proj_Auto_Ecole.service.EleveServiceImp;
import ma.Proj_Auto_Ecole.service.MoniteurServiceImp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class MoniteurController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MoniteurController.class);

    private  MoniteurServiceImp MoniteurServiceImp;
    public  MoniteurController(MoniteurServiceImp MoniteurServiceImp )
    {
        this.MoniteurServiceImp = MoniteurServiceImp;
    }
    @PostMapping("/create")
    public MoniteursDto create (@RequestBody MoniteursDto dto)
    {
        LOGGER.debug("start save dto : {}", dto);
        MoniteursDto result = MoniteurServiceImp.create(dto);
        LOGGER.debug("end save");
        return result;
    }
    @PutMapping("/update")
    public MoniteursDto update(@RequestBody MoniteursDto dto)
    {
        LOGGER.debug("start update dto : {}",dto);
        MoniteursDto result=MoniteurServiceImp.update(dto);
        LOGGER.debug("end update");
        return  result;
    }

    @DeleteMapping("/{cin}")
    public boolean delete (@PathVariable("cin") String cin)
    {
        LOGGER.debug("start delete dto : {}",cin);
        boolean result = MoniteurServiceImp.delete(cin);
        LOGGER.debug("end delete");
        return  result;
    }

    @GetMapping("/select")
    public List<MoniteursDto> selectAll()
    {
        LOGGER.debug("start  selectAll");
        List<MoniteursDto>lls=MoniteurServiceImp.select();
        LOGGER.debug("end methode selectAll");
        return lls;
    }
}
