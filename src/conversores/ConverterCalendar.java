package conversores;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "converterCalendar")
public class ConverterCalendar implements Converter {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	// Converte da Tela para o objeto
	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String string) {

		Calendar c = Calendar.getInstance();
		sdf.setLenient(false);
		try {
			c.setTime(sdf.parse(string));
		} catch (Exception e) {
			return null;
		}
		return c;
	}

	// Converte do objeto para a Tela
	@Override
	public String getAsString(FacesContext context, UIComponent component, Object obj) {

		Calendar c = (Calendar) obj;
		String str = sdf.format(c.getTime());
		return str;

	}

}
