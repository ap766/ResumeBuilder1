import com.itextpdf.kernel.color.Color;
//import com.itextpdf.kernel.color.ColorConstants;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;

import java.io.FileNotFoundException;

public class pdfGenerator {
	public static String fname, lname, prof, city, state, zipcode, phoneno, email;
	public static String sname, sloc, degree, fos, sstart, send;
	public static String job, employer, jcity, jstate, jstart, jend, workdes;
	public static String lang1, lang2, lang3, lang4, lang5;
	public static String skill1, skill2, skill3, skill4, skill5, filename;
	
    public void main(String[] args) throws FileNotFoundException {
    }
    
    @SuppressWarnings("deprecation")
	static Cell getheadertextvalue(String val){
        return new Cell().add(val).setBorder(Border.NO_BORDER).setFontColor(Color.WHITE).setFontSize(10f).setPaddingLeft(10f);
    }

    @SuppressWarnings("deprecation")
	static Cell getheaderbold(String val){
        return new Cell().add(val).setBold().setBorder(Border.NO_BORDER).setFontColor(Color.WHITE).setFontSize(10f).setPaddingLeft(10f);
    }
    public pdfGenerator() throws FileNotFoundException{
		Generate_Pdf();
	}
    
    public static void InformationInit(String fname1,String lname1,String prof1,String city1,String state1,String zipcode1,String phoneno1,String email1) {
    	fname=fname1;
    	lname=lname1;
    	prof=prof1;
    	city=city1;
    	state=state1;
    	zipcode=zipcode1;
    	phoneno=phoneno1;
    	email=email1;
    }
    public static void EducationInit(String sname1,String sloc1,String degree1,String fos1,String sstart1,String send1) {
    	sname=sname1;
    	sloc=sloc1;
    	degree=degree1;
    	fos=fos1;
    	sstart=sstart1;
    	send=send1;
    }
    public static void WorkInit(String job1,String employer1,String jcity1,String jstate1,String jstart1,String jend1,String workdes1) {
    	job=job1;
    	employer=employer1;
    	jcity=jcity1;
    	jstate=jstate1;
    	jstart=jstart1;
    	jend=jend1;
    	workdes=workdes1;
    }
    public static void LanguagesInit(String lang1o,String lang2o,String lang3o,String lang4o,String lang5o) {
    	lang1=lang1o;
    	lang2=lang2o;
    	lang3=lang3o;
    	lang4=lang4o;
    	lang5=lang5o;
    }
    public static void SkillsInit(String skill1o,String skill2o,String skill3o,String skill4o,String skill5o) {
    	skill1=skill1o;
    	skill2=skill2o;
    	skill3=skill3o;
    	skill4=skill4o;
    	skill5=skill5o;
    }
    public static void DownloadInit(String filename1) {
    	filename=filename1;
    }
    public static void Generate_Pdf() throws FileNotFoundException {
        String path = filename+".pdf";
        PdfWriter pdfWriter=new PdfWriter(path);
        PdfDocument pdfDocument=new PdfDocument(pdfWriter);
        pdfDocument.setDefaultPageSize(PageSize.A4);
        Document document=new Document(pdfDocument);
        float twocol=150f;
        float twocol150=twocol+285f;
        float twocolumnWidth[]={twocol,twocol150};
        Paragraph onesp=new Paragraph("\n").setBorder(Border.NO_BORDER);
        Table table=new Table(twocolumnWidth);

        Table nestedtable=new Table(new float[]{twocol});


        nestedtable.setBackgroundColor(new DeviceRgb(0,61,116)).setBorder(Border.NO_BORDER);


        nestedtable.addCell(getheaderbold(fname+" "+lname).setFontSize(25f));
        nestedtable.addCell(getheadertextvalue(prof).setFontSize(12f));
        nestedtable.addCell(new Cell().add(onesp).setBorder(Border.NO_BORDER));
        nestedtable.addCell(getheaderbold("Personal Info").setFontSize(15f).setBackgroundColor(new DeviceRgb(0,46,88)));
        nestedtable.addCell(getheaderbold("Address"));
        nestedtable.addCell(getheadertextvalue(city+"\n"+state+"-"+zipcode));
        nestedtable.addCell(getheaderbold("Phone"));
        nestedtable.addCell(getheadertextvalue(phoneno));
        nestedtable.addCell(getheaderbold("E-mail"));
        nestedtable.addCell(getheadertextvalue(email));
        nestedtable.addCell(new Cell().add(onesp).setBorder(Border.NO_BORDER));
        nestedtable.addCell(getheaderbold("Skills").setFontSize(15f).setBackgroundColor(new DeviceRgb(0,46,88)));
        nestedtable.addCell(getheadertextvalue(skill1));
        nestedtable.addCell(getheadertextvalue(skill2));
        nestedtable.addCell(getheadertextvalue(skill3));
        nestedtable.addCell(getheadertextvalue(skill4));
        nestedtable.addCell(getheadertextvalue(skill5));
        nestedtable.addCell(new Cell().add(onesp).setBorder(Border.NO_BORDER));
        nestedtable.addCell(getheaderbold("Languages").setFontSize(15f).setBackgroundColor(new DeviceRgb(0,46,88)));
        nestedtable.addCell(getheadertextvalue(lang1));
        nestedtable.addCell(getheadertextvalue(lang2));
        nestedtable.addCell(getheadertextvalue(lang3));
        nestedtable.addCell(getheadertextvalue(lang4));
        nestedtable.addCell(getheadertextvalue(lang5));
        nestedtable.addCell(new Cell().add(onesp).setBorder(Border.NO_BORDER));
        table.addCell(new Cell().add(nestedtable));


        Table nt=new Table(new float[]{twocol150});
        nt.addCell(new Cell().add("I’m a "+prof+" with a good experience in the "+ fos +" field. I have a strong track record of "+skill1+", "+skill2+". I have good communication and leadership skills. I’m a motivated individual with strong problem-solving skills and I have a keen interest in staying up-to-date with the latest developments in the tech industry. In my free time, I like to listen to music, read books, learn any new language and cook.").setBorder(Border.NO_BORDER).setPadding(10f).setTextAlignment(TextAlignment.JUSTIFIED));

        nt.addCell(new Cell().add(onesp).setBorder(Border.NO_BORDER));
        nt.addCell(new Cell().add("Experience").setFontSize(15f).setBold().setFontColor(new DeviceRgb(31,77,120)).setBorder(Border.NO_BORDER).setPadding(10f));
        nt.addCell(new Cell().add(job).setBorder(Border.NO_BORDER).setBold().setFontSize(13f).setPaddingLeft(20f));
        nt.addCell(new Cell().add("- "+employer).setBorder(Border.NO_BORDER).setFontSize(11f).setPaddingLeft(20f));
        nt.addCell(new Cell().add("- "+jcity+", "+jstate).setBorder(Border.NO_BORDER).setFontSize(11f).setPaddingLeft(20f));
        nt.addCell(new Cell().add("- "+jstart+" - "+jend).setBorder(Border.NO_BORDER).setFontSize(11f).setPaddingLeft(20f));
        nt.addCell(new Cell().add("- "+workdes).setBorder(Border.NO_BORDER).setFontSize(11f).setPaddingLeft(20f).setTextAlignment(TextAlignment.JUSTIFIED));

        nt.addCell(new Cell().add(onesp).setBorder(Border.NO_BORDER));
        nt.addCell(new Cell().add("Education").setFontSize(15f).setFontColor(new DeviceRgb(31,77,120)).setBold().setBorder(Border.NO_BORDER).setPadding(10f));
        nt.addCell(new Cell().add(degree).setFontSize(13f).setBorder(Border.NO_BORDER).setBold().setPaddingLeft(20f));
        nt.addCell(new Cell().add("- Studied at "+sname+"\n- "+sloc).setFontSize(11f).setBorder(Border.NO_BORDER).setPaddingLeft(20f));
        nt.addCell(new Cell().add("- Field of study : "+fos).setFontSize(11f).setBorder(Border.NO_BORDER).setPaddingLeft(20f));
        nt.addCell(new Cell().add("- Graduated on "+send).setFontSize(11f).setBorder(Border.NO_BORDER).setPaddingLeft(20f));
        table.addCell(new Cell().add(nt));
        document.add(table);


        document.close();
        System.out.println("PDF generated");
    }
}




