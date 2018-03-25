package school;

import java.sql.*;

public class Queries{
    /**
     * Display data for all classes
     */
	public void firstQuery(){
		try {
			Class.forName("org.postgresql.Driver").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				System.err.println("Can’t load driver. Verify CLASSPATH");
				System.err.println(e.getMessage());
			}
			DriverManager.setLoginTimeout(60);
			String url = "jdbc:postgresql://127.0.0.1:5432/school?user=postgres&password=xenia89";

			try (final Connection conn = DriverManager.getConnection(url);
				 final Statement st1 = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				 final ResultSet rs1 = st1.executeQuery("SELECT * FROM classes INNER JOIN courses ON classes.courseid=courses.courseid\n" +
						 "INNER JOIN crosslistings ON crosslistings.courseid=courses.courseid\n" +
						 "INNER JOIN courseprofs ON courseprofs.courseid=courses.courseid\n" +
						 "INNER JOIN profs ON profs.profid=courseprofs.profid\n" +
						 "ORDER BY courses.title")) {
				while (rs1.next()) {
					System.out.println("ClassId: " + rs1.getInt(1));
					System.out.println("CourseId: " + rs1.getInt(2));
					System.out.println("Days: : " + rs1.getInt(3));
					System.out.println("StartTime: " + rs1.getTime(4));
					System.out.println("Endtime: " + rs1.getTime(5));
					System.out.println("Building: " + rs1.getInt(6));
					System.out.println("RoomNumber: " + rs1.getInt(7));
					System.out.println("CourseId: " + rs1.getInt(8));
					System.out.println("Area: " + rs1.getInt(9));
					System.out.println("Title: " + rs1.getString(10));
					System.out.println("Description: " + rs1.getString(11));
					System.out.println("Prerequistites: " + rs1.getString(12));
					System.out.println("CourseId: " + rs1.getInt(13));
					System.out.println("Dept: " + rs1.getString(14));
					System.out.println("CourseNumber: " + rs1.getInt(15));
					System.out.println("CourseId: " + rs1.getInt(16));
					System.out.println("Profid: " + rs1.getInt(17));
					System.out.println("Profid: " + rs1.getInt(18));
					System.out.println("ProfName: " + rs1.getString(19));
					System.out.println("--------------------------");

				}

			} catch (SQLException e) {
				System.err.println("Can't connect to the database" + e.getMessage());
			}
		}

    /**
     * //Display data for all classes with specified id
     * @param i-input the courseid
     */
		public void secondQuery(int i){
			try {
				Class.forName("org.postgresql.Driver").newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				System.err.println("Can’t load driver. Verify CLASSPATH");
				System.err.println(e.getMessage());
			}
			DriverManager.setLoginTimeout(60);
			String url = "jdbc:postgresql://127.0.0.1:5432/school?user=postgres&password=xenia89";
			try(final Connection conn=DriverManager.getConnection(url);
									   final PreparedStatement st2=conn.prepareStatement("SELECT * From courses WHERE courseid=?")){
			st2.setInt(1,i);
			final ResultSet rs2=st2.executeQuery();
			while(rs2.next()){
				System.out.println("CourseId: "+rs2.getInt(1));
				System.out.println("Area: "+rs2.getInt(2));
				System.out.println("Title: "+rs2.getString(3));
				System.out.println("Description: "+rs2.getString(4));
				System.out.println("Prerequisites: "+rs2.getString(5));
				System.out.println("-------------");
			}
		} catch (SQLException e) {
			System.err.println("Can't connect to the database"+e.getMessage());
		}
		}

    /**
     *Display data for all classes whose title (when converted to all lowercase letters) begins with "intro".
     */
		public void thirdQuery() {
			try {
				Class.forName("org.postgresql.Driver").newInstance();
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				System.err.println("Can’t load driver. Verify CLASSPATH");
				System.err.println(e.getMessage());
			}
			DriverManager.setLoginTimeout(60);
			String url = "jdbc:postgresql://127.0.0.1:5432/school?user=postgres&password=xenia89";
			try (final Connection conn = DriverManager.getConnection(url);
				 final Statement st3 = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
				 final ResultSet rs3 = st3.executeQuery("SELECT * FROM classes INNER JOIN courses ON classes.courseid=courses.courseid\n" +
						 "INNER JOIN crosslistings ON crosslistings.courseid=courses.courseid\n" +
						 "INNER JOIN courseprofs ON courseprofs.courseid=courses.courseid\n" +
						 "INNER JOIN profs ON profs.profid=courseprofs.profid\n" +
						 "WHERE LOWER(substring(courses.title,1,5))='intro'")) {
				while (rs3.next()) {
					System.out.println("ClassId: " + rs3.getInt(1));
					System.out.println("CourseId: " + rs3.getInt(2));
					System.out.println("Days: : " + rs3.getInt(3));
					System.out.println("StartTime: " + rs3.getTime(4));
					System.out.println("Endtime: " + rs3.getTime(5));
					System.out.println("Building: " + rs3.getInt(6));
					System.out.println("RoomNumber: " + rs3.getInt(7));
					System.out.println("CourseId: " + rs3.getInt(8));
					System.out.println("Area: " + rs3.getInt(9));
					System.out.println("Title: " + rs3.getString(10));
					System.out.println("Description: " + rs3.getString(11));
					System.out.println("Prerequistites: " + rs3.getString(12));
					System.out.println("CourseId: " + rs3.getInt(13));
					System.out.println("Dept: " + rs3.getString(14));
					System.out.println("CourseNumber: " + rs3.getInt(15));
					System.out.println("CourseId: " + rs3.getInt(16));
					System.out.println("Profid: " + rs3.getInt(17));
					System.out.println("Profid: " + rs3.getInt(18));
					System.out.println("ProfName: " + rs3.getString(19));
					System.out.println("--------------------------");

				}
			} catch (SQLException e) {
				System.err.println("Can't connect to the database" + e.getMessage());
			}
		}

    /**
     * Display data for all classes whose dept
     * (when converted to all lowercase letters) is "cos" and whose coursenum begins with "3"
     */

			public void fourthQuery() {
				try {
					Class.forName("org.postgresql.Driver").newInstance();
				} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
					System.err.println("Can’t load driver. Verify CLASSPATH");
					System.err.println(e.getMessage());
				}
				DriverManager.setLoginTimeout(60);
				String url = "jdbc:postgresql://127.0.0.1:5432/school?user=postgres&password=xenia89";
				try (final Connection conn = DriverManager.getConnection(url);
					 final Statement st4 = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
					 final ResultSet rs4 = st4.executeQuery("SELECT * FROM classes INNER JOIN courses ON classes.courseid=courses.courseid\n" +
							 "INNER JOIN crosslistings ON crosslistings.courseid=courses.courseid\n" +
							 "INNER JOIN courseprofs ON courseprofs.courseid=courses.courseid\n" +
							 "INNER JOIN profs ON profs.profid=courseprofs.profid\n" +
							 "WHERE LOWER(crosslistings.dept)='cos' \n" +
							 "AND (crosslistings.coursenum::varchar(255)) LIKE '3%'")) {
					while (rs4.next()) {
						System.out.println("ClassId: " + rs4.getInt(1));
						System.out.println("CourseId: " + rs4.getInt(2));
						System.out.println("Days: : " + rs4.getInt(3));
						System.out.println("StartTime: " + rs4.getTime(4));
						System.out.println("Endtime: " + rs4.getTime(5));
						System.out.println("Building: " + rs4.getInt(6));
						System.out.println("RoomNumber: " + rs4.getInt(7));
						System.out.println("CourseId: " + rs4.getInt(8));
						System.out.println("Area: " + rs4.getInt(9));
						System.out.println("Title: " + rs4.getString(10));
						System.out.println("Description: " + rs4.getString(11));
						System.out.println("Prerequistites: " + rs4.getString(12));
						System.out.println("CourseId: " + rs4.getInt(13));
						System.out.println("Dept: " + rs4.getString(14));
						System.out.println("CourseNumber: " + rs4.getInt(15));
						System.out.println("CourseId: " + rs4.getInt(16));
						System.out.println("Profid: " + rs4.getInt(17));
						System.out.println("Profid: " + rs4.getInt(18));
						System.out.println("ProfName: " + rs4.getString(19));
						System.out.println("--------------------------");

					}
				} catch (SQLException e) {
					System.err.println("Can't connect to the database" + e.getMessage());
				}
			}
	}
