import { AppBar, Typography, Toolbar } from "@mui/material";
import DarkModeButton from "./DarkModeButton";

const NavBar = (props) => {
	const { darkMode, setDarkMode } = props;
	return (
		<AppBar position="static" color="primary">
			<Toolbar>
				<Typography variant="h6" component="div" sx={{ flexGrow: 1 }}>
					RiskGuard Redactor
				</Typography>
				<DarkModeButton darkMode={darkMode} setDarkMode={setDarkMode} />
			</Toolbar>
		</AppBar>
	);
};

export default NavBar;
